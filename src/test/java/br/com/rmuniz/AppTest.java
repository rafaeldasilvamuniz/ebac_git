package br.com.rmuniz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void escapeHTMLTest() {
        String escapedHtml = SuperUtil.escapeHTML("<script>alert('Envio de msg de html1');</script>");
        String expected = "&lt;script&gt;alert('Envio de msg de html2');&lt;/script&gt;";
        Assert.assertEquals(expected, escapedHtml);
    }

}
