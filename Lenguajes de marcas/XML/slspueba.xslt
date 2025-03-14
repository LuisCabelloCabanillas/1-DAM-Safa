<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!--xsl:stylesheet version="1.0" zmlns:xsl="http://www.w3.org/1999/"-->
<xsl:template match="/">
<html>
<body>
    <table border="1">
        <tr>
            <th>IdProducto</th>
            <th>Nombre</th>
            <th>Origen</th>
            <th>Cantidad</th>
            <th>Precio</th>
        </tr>
        <xsl:for.each select="canasta/producto">
        <tr>
            <td>
                <xsl:value-of select="@IdProducto">
            </td>
            <td>
                <xsl:value-of select="nombre">
            </td>
            <td>
                <xsl:value-of select="origen">    
            </td>
            <td>
                <xsl:value-of select="cantidad">
            </td>
            <td>
                <xsl:value-of select="precio">
            </td>
        </tr>
    </table>
</body>

</html>
</xsl:template>