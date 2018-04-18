var util =     require ('util')

describe('To test E2E Flow ',function(){
    
    beforeEach(function(){
        browser.get('http://www.thetestroom.com/jswebapp');
       
    });
    
    xit('should be able to adopt an animal',function(){
        element(by.model('person.name')).sendKeys("This is E2E Test");
        var dynamicText = element(by.binding('person.name')).getText();
            expect(dynamicText).toBe("This is E2E Test");
        
        element(by.buttonText('CONTINUE')).click();
        
       element(by.model("animal")).$('[value="2"]').click();
        
        element(by.buttonText('CONTINUE')).click();
    
        var thankyouText = element(by.css('h1')).getText();
        expect(thankyouText).toBe('Thank you');
        
    });
       var home_Page = require('../page/home_Page.js');
    it('should be able to adopt an animal using POM pattern ',function(){
            home_Page.enterFieldValue('Jagdish Odedra');
            var getHomePageText = home_Page.getDynamicText();
            expect(getHomePageText).toBe('Jagdish Odedra');
                
                
             home_Page.clickContinue();
            
       
    
    
    
    });  
    
});