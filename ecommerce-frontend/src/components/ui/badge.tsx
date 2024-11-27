import * as React from "react"
import { cn } from "../../utils/helpers"

interface BadgeProps extends React.HTMLAttributes<HTMLDivElement> {
    variant?: "default" | "secondary" | "destructive" | "outline";
}

const Badge = React.forwardRef<HTMLDivElement, BadgeProps>(({ className, variant = "default", ...props }, ref) => (
    <div
        ref={ref}
        className={cn(
            "inline-flex items-center rounded-full border px-2.5 py-0.5 text-xs font-semibold transition-colors focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2",
            {
                "border-transparent bg-primary text-primary-foreground": variant === "default",
                "border-transparent bg-secondary text-secondary-foreground": variant === "secondary",
                "border-transparent bg-destructive text-destructive-foreground": variant === "destructive",
                "border-transparent bg-muted text-muted-foreground": variant === "outline",
            },
            className
        )}
        {...props}
    />
))
Badge.displayName = "Badge"

export { Badge }