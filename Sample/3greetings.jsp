<html>
    <body bgcolor="white">
    <% java.util.Date clock = new java.util.Date( ); %>
    <% if (clock.getHours( ) < 12) { %>
      <h1>Good morning!</h1>
    <% } else if (clock.getHours( ) < 18) { %>
      <h1>Good afternoon!</h1>
    <% } else { %>
      <h1>Good evening!</h1>
    <% } %>
    Welcome to our site, open 24 hours a day.
    </body>
</html>
