<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/">
        <html>
            <body>
            	<div align="left">
                	<xsl:apply-templates />
                </div>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="employees">
        <table border="1">
            <xsl:for-each select="employee">
                <tr>
                    <td>
                        <xsl:value-of select="ssn" />
                    </td>
                    <td>                       
                        <xsl:value-of select="firstname" />                       
                    </td>
                    <td>
                        <xsl:value-of select="lastname" />
                    </td>
                    <td>
                        <xsl:value-of select="role" />
                    </td>
                    <td>
                        <xsl:value-of select="salary" />
                    </td>
                     
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>