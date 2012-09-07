/**
 * 
 */
package com.robotsidekick.example;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.robotsidekick.example.datastructures.Car;
import com.robotsidekick.example.datastructures.Person;
import com.robotsidekick.server.SocketServer;

/**
 * @author alex
 *
 */
public final class TestClient
{

    public static void main(final String[] args)
    {
        try
        {
            final Socket socket = new Socket("localhost", 12345);

            SocketServer.writeObject(new Person("Alex", "Baker"), socket);

            final Car result = SocketServer.readObject(socket, Car.class);
            if (result != null)
            {
                System.out.println("CLIENT: " + result.toString());
            }
            else
            {
                System.out.println("CLIENT: sad");
            }
        }
        catch (final UnknownHostException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (final IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // deelmmnrrstz
    // beeehijmrrtw
}
// z
// behijtw

// eemrrt
