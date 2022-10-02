[![CI Status](https://github.com/AY2223S1-CS2103T-W16-2/tp/workflows/Java%20CI/badge.svg)](https://github.com/AY2223S1-CS2103T-W16-2/tp/actions)
[![codecov](https://codecov.io/gh/AY2223S1-CS2103T-W16-2/tp/branch/master/graph/badge.svg)](https://codecov.io/gh/AY2223S1-CS2103T-W16-2/tp)

![Ui](docs/images/Ui.png)

## FoodRem
FoodRem is an application that enables you to efficiently keep track of inventory in your daily restaurants operations. It is a convenient and efficient administrative tool to ensure less food wastage and a constant supply of fresh food to increase revenue and improve the quality of food. With a few quick commands, you can have complete control of your perishable goods.

## Acknowledgements
This project is based on the AddressBook-Level3 project created by the [SE-EDU initiative](https://se-education.org).

---

## Setting up

- [ ] _TODO: Move this section to the developer guide once everything is finalised in later stages_

### Setting up Git hooks

1. Ensure [`pre-commit`](https://pre-commit.com/) is installed.
   - macOS (Homebrew):
     ```sh
     brew install pre-commit
     ```
   - Windows, Linux (requires python):
     ```sh
     pip install pre-commit
     ```
1. In the root of the repository, run:
   ```sh
   make hooks
   ```
   Simply re-run this command when hooks need to be updated.

Hooks will automatically run on all **staged** files before commits and pushes.

To manually run hooks for **staged** files, run:

```sh
make lint
```

To manually run hooks for all **tracked** files, run:

```sh
make lint-all
```

If your shell supports double-asterisk `**` globbing you can manually run hooks for all files, including untracked files, by running:

```sh
pre-commit run --files **/*
```

Shells that support this include `zsh` and newer versions of `bash` (version &ge; 4.0, with the `globstar` shell option enabled),
