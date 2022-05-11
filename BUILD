load("@bazel_gazelle//:def.bzl", "gazelle")
load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier")
load("@io_bazel_rules_go//proto:compiler.bzl", "go_proto_compiler")
load("@io_bazel_rules_go//proto/wkt:well_known_types.bzl", "PROTO_RUNTIME_DEPS", "WELL_KNOWN_TYPES_APIV2")

buildifier(
    name = "buildifier",
)

buildifier(
    name = "buildifier_check",
    mode = "check",
)

# gazelle:exclude _output
# gazelle:prefix github.com/xushaoxiao/bazel-grpc-gateway
# gazelle:go_proto_compilers //:go_apiv2
# gazelle:go_grpc_compilers //:go_apiv2, //:go_grpc
# gazelle:go_naming_convention import_alias
# gazelle:go_grpc_compilers //:go_apiv2, //:go_grpc, //protoc-gen-grpc-gateway:go_gen_grpc_gateway
gazelle(name = "gazelle")

gazelle(
    name = "gazelle-update-repos",
    args = [
        "-from_file=go.mod",
        "-to_macro=deps.bzl%go_dependencies",
        "-prune",
    ],
    command = "update-repos",
)

package_group(
    name = "generators",
    packages = [
        "//protoc-gen-grpc-gateway/...",
        "//protoc-gen-openapiv2/...",
    ],
)

go_proto_compiler(
    name = "go_apiv2",
    options = [
        "paths=source_relative",
    ],
    plugin = "@org_golang_google_protobuf//cmd/protoc-gen-go",
    suffix = ".pb.go",
    visibility = ["//visibility:public"],
    deps = PROTO_RUNTIME_DEPS + WELL_KNOWN_TYPES_APIV2,
)

go_proto_compiler(
    name = "go_grpc",
    options = [
        "paths=source_relative",
        "require_unimplemented_servers=false",
    ],
    plugin = "@org_golang_google_grpc_cmd_protoc_gen_go_grpc//:protoc-gen-go-grpc",
    suffix = "_grpc.pb.go",
    visibility = ["//visibility:public"],
    deps = PROTO_RUNTIME_DEPS + [
        "@org_golang_google_grpc//:go_default_library",
        "@org_golang_google_grpc//codes:go_default_library",
        "@org_golang_google_grpc//status:go_default_library",
    ],
)
