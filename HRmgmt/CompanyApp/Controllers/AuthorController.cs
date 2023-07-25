using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using CompanyApp.Models;
using BOL;
using DAL;

namespace CompanyApp.Controllers;

public class AuthorController : Controller
{
    private readonly ILogger<AuthorController> _logger;

    public AuthorController(ILogger<AuthorController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }

    public IActionResult InsertAuthor()
    {
        return View();
    }

    [HttpPost]
    public IActionResult InsertAuthor(int authId,string name,string description,string email,string phone,double salary)
    {
        Author auth=new Author(authId, name, description, email,phone,salary);
        bool status=DbManager.Insert(auth);
        return RedirectToAction("Index","Home");
    }

    public IActionResult DeleteAuthor()
    {
        return View();
    }

    [HttpPost]
    public IActionResult DeleteAuthor(int authId)
    {
        bool status=DbManager.Delete(authId);   
        return RedirectToAction("Index","Home");
    }


}


