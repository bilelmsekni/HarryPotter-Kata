using System;
using NUnit.Framework;
using TechTalk.SpecFlow;

namespace HarryPotter
{
    [Binding]
    public class EstimatePurchaseV1Steps
    {
        private Book _book;

        [Given(@"A book")]
        public void GivenABook()
        {
            _book = new Book {Price = 8};
        }
        
        [Then(@"its price is (.*) €")]
        public void ThenItsPriceIs(int p0)
        {
            Assert.AreEqual(_book.Price, 8);
        }
    }
}
